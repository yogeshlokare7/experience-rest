package com.experience.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.experience.model.UserPermission;
import com.experience.service.PermissionService;

@RestController
@RequestMapping("/permission")
public class UserPermissionController {
	
	@Autowired
	private PermissionService permissionService;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Iterable<UserPermission> getAllRoles() throws Exception{
		return permissionService.getPermissionList();
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<UserPermission> createRole(@RequestBody UserPermission role, HttpServletRequest request) throws Exception {
		UserPermission createdRole = this.permissionService.savePermission(role);
		return ResponseEntity.ok().body(createdRole);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
	public ResponseEntity<UserPermission> getUserByUserId(@PathVariable("id") Integer id) throws Exception {
		UserPermission role = permissionService.getPermission(id);
		return ResponseEntity.ok().body(role);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<String> deleteUser(@PathVariable("id") Integer id) throws Exception {
		permissionService.deletePermission(id);
		return ResponseEntity.ok().body("Successfully removed account of user");
	}

}
