package Projettodolist.to_do_list.model;

import jakarta.persistence.*;
import lombok.*;

import java.security.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = Date.from(Instant.now());
        updatedAt = Date.from(Instant.now());
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = Date.from(Instant.now());
    }


    public enum TaskStatus {
        TO_DO,
        IN_PROGRESS,
        DONE
    }
}
