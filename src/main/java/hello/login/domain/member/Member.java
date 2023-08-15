package hello.login.domain.member;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Member {
    private Long id;

    @NotEmpty
    private String loginId; //login id
    @NotEmpty
    private String name; //member name
    @NotEmpty
    private String password;
}
