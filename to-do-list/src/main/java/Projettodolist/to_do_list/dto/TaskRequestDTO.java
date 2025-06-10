package Projettodolist.to_do_list.dto;

import Projettodolist.to_do_list.model.Task;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskRequestDTO {
    private String title;
    private String description;
    @Enumerated(EnumType.STRING)
    private Task.TaskStatus status;
}
