package com.example.demo.model.service;

import com.example.demo.model.domain.Member;

import jakarta.validation.constraints.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddMemberRequest {
    // 이름: 공백 불가, 특수문자 불가 (한글·영문·숫자만)
    @NotBlank(message = "이름은 필수 입력 항목입니다.")
    @Pattern(regexp = "^[가-힣a-zA-Z0-9]+$", 
             message = "이름은 한글, 영문, 숫자만 사용할 수 있습니다.")
    private String name;

    // 이메일: 공백 불가, 이메일 형식
    @NotBlank(message = "이메일은 필수 입력 항목입니다.")
    @Email(message = "올바른 이메일 형식이 아닙니다.")
    private String email;

    // 비밀번호: 8자 이상, 대소문자·숫자·특수문자 각각 최소 1개 포함
    @NotBlank(message = "비밀번호는 필수 입력 항목입니다.")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$",
             message = "비밀번호는 영문 대소문자, 숫자, 특수문자를 각각 1개 이상 포함해야 합니다.")
    private String password;

    // 나이: 19~90세 사이 숫자만 (문자열로 받음)
    @NotBlank(message = "나이는 필수 입력 항목입니다.")
    @Pattern(regexp = "^(19|[2-8][0-9]|90)$",
             message = "나이는 19세 이상 90세 이하여야 합니다.")
    private String age;

    // 모바일: 공백 허용, 입력 시 한국 휴대폰 형식
    @Pattern(regexp = "^01(?:0|1|[6-9])[0-9]{3,4}[0-9]{4}$|^$",
             message = "올바른 휴대폰 번호 형식이 아닙니다.")
    private String mobile;

    // 주소: 공백 허용
    private String address;

    public Member toEntity(){ 
        return Member.builder()
        .name(name)
        .email(email)
        .password(password)
        .age(age)
        .mobile(mobile)
        .address(address)
        .build();
    }
}