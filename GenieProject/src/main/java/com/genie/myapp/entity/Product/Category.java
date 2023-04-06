package com.genie.myapp.entity.Product;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.util.*;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.*;

@Entity
@Getter @Setter
public class Category {

    @Id @GeneratedValue(strategy = IDENTITY)
    private long categoryId;

    @OneToMany(mappedBy = "categoryConnectId", cascade = ALL)
    private Set<CategoryConnect> connectList = new HashSet<>();

    private String productCategory;
    private String productCategoryEng;

}
