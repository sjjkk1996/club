package org.zerock.club.entity;

import lombok.*;
import org.hibernate.annotations.Fetch;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class ClubMember extends BaseEntity{

    @Id
    private String email;

    private String password;

    private String name;

    private boolean fromSocial;
   @ElementCollection(fetch = FetchType.LAZY)
   @Builder.Default
    private Set<ClubMemberRole> roleSet = new HashSet<>();
   //set은 복수개를 가질수 있음

   public void addMemberRole(ClubMemberRole clubMemberRole){
       roleSet.add(clubMemberRole);
       //맵은 put 리스트와, 셋은 add 로 추가함
   }

}
