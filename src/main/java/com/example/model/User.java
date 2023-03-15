package com.example.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="userc")
public class User {
	@Id
	private String userId;
	
	private String userName;
	
	@OneToMany(mappedBy = "user") // reply의 user
	private List<Reply> replyList = new ArrayList<>();
	
	@OneToMany(mappedBy = "user") // comment의 user
	private List<Comment> commentList = new ArrayList<>();
}
