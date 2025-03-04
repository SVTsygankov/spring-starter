package com.svtsygankov.spring.dto;

import com.svtsygankov.spring.database.entity.Role;
import com.svtsygankov.spring.validation.UserInfo;
import com.svtsygankov.spring.validation.group.UpdateAction;
import com.svtsygankov.spring.validation.group.CreateAction;
import lombok.Value;
import lombok.experimental.FieldNameConstants;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Value
@FieldNameConstants
@UserInfo(groups = UpdateAction.class)
public class UserCreateEditDto {
    @Email
    String username;

    @NotBlank(groups = CreateAction.class)
    String rawPassword;

    //    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate birthDate;

    @Size(min = 3, max = 64)
    String firstname;

    @Size(min = 3, max = 64)
    String lastname;

    Role role;

    Integer companyId;

    MultipartFile image;
}
