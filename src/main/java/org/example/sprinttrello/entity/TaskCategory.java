package org.example.sprinttrello.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.sprinttrello.entity.base.BaseEntity;

@Entity
@Table(name = "TASK_CATEGORIES")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TaskCategory extends BaseEntity {

    @Column(name = "NAME")
    private String name;
}
