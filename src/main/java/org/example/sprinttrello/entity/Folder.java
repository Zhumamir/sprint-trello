package org.example.sprinttrello.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.sprinttrello.entity.base.BaseEntity;

import java.util.List;

@Entity
@Table(name = "FOLDERS")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Folder extends BaseEntity {

    @Column(name = "NAME")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<TaskCategory> categories;
}
