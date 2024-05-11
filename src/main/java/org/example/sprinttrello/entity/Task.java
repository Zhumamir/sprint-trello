package org.example.sprinttrello.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.sprinttrello.entity.base.BaseEntity;

@Entity
@Table(name = "TASKS")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Task extends BaseEntity {

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "STATUS")
    private Integer status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FOLDER_ID")
    private Folder folder;
}
