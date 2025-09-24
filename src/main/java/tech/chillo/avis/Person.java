package tech.chillo.avis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Data @Builder @Setter @Getter @ToString
public class Person {
	private String name;
    private int age;
}
