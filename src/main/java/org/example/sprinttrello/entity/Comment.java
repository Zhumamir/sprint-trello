package org.example.sprinttrello.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.sprinttrello.entity.base.BaseEntity;

@Entity
@Table(name = "COMMENTS")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Comment extends BaseEntity {

    @Column(name = "VALUE")
    private String value;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TASK_ID")
    private Task task;
}
