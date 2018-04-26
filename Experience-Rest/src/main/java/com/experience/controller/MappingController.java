package com.experience.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.experience.dto.PermissionRoleDto;
import com.experience.dto.RolePermissionDto;
import com.experience.model.Role;
import com.experience.model.Rolepermission;
import com.experience.model.UserPermission;
import com.experience.service.PermissionService;
import com.experience.service.RolePermissionService;
import com.experience.service.RoleService;


@Controller
@RequestMapping("/role/permission")
public class MappingController {

	@Autowired
	private RolePermissionService rolePermissionService;
	
	@Autowired
	private RoleService roleService;

	@Autowired
	private PermissionService permissionService;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<PermissionRoleDto> getAllRolePermissions() throws Exception{
		List<PermissionRoleDto> permissionRoleDtos = new ArrayList<PermissionRoleDto>();
		List<Integer> roleIds = rolePermissionService.findDistinctByRoleid();
		for(Integer roleId:roleIds) {
			if(roleId!=null && roleId>=0) {
				PermissionRoleDto permissionRoleDto  = new PermissionRoleDto();
				Role role = roleService.getRole(roleId);
				List<UserPermission> userPermissions = new ArrayList<UserPermission>();
				List<Rolepermission> rolepermissions = rolePermissionService.findByRolePermission(role.getId());
				for(Rolepermission obj: rolepermissions) {
					UserPermission userPermission = permissionService.getPermission(obj.getPermId());
					userPermissions.add(userPermission);
				}
				permissionRoleDto.setRole(role);
				permissionRoleDto.setRolePermissions(userPermissions);
				permissionRoleDtos.add(permissionRoleDto);
			}
		}
		return permissionRoleDtos;
	}

	@RequestMapping(value = "", method = RequestMethod.POST, consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"}) 
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<RolePermissionDto> saveMapping(@RequestBody RolePermissionDto dto,  Model model) throws Exception {
		System.out.println("=====================DTO================"+dto.toString());
		for(Integer permissionId : dto.getPermissionIds()) {
			if(permissionId!=null && dto.getRoleId()!=null) {
				Rolepermission rolepermission = new Rolepermission();
				rolepermission.setRoleid(dto.getRoleId());
				rolepermission.setPermId(permissionId);
				rolePermissionService.saveRolepermission(rolepermission);
			}
		}
		return ResponseEntity.ok().body(dto);  
	}
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
	public @ResponseBody List<Rolepermission> getRoleByid(@PathVariable("id") Integer id) throws Exception {
		List<Rolepermission> rolepermission = rolePermissionService.findByRolePermission(id);
		System.out.println("=========T============="+rolepermission.toString());
		return rolepermission;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteMappingByRole(@PathVariable("id") Integer id) throws Exception {
		rolePermissionService.deleteRolepermissionByRoleId(id);
	}
}
