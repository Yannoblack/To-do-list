package Projettodolist.to_do_list.mapper;

import Projettodolist.to_do_list.dto.TaskRequestDTO;
import Projettodolist.to_do_list.model.Task;

public class TaskMapper {
    // Méthode pour convertir un TaskRequestDTO en entité Task
    public static Task toTask(TaskRequestDTO taskRequestDTO) {
        Task task = new Task();
        task.setTitle(taskRequestDTO.getTitle());
        task.setDescription(taskRequestDTO.getDescription());
        task.setStatus(taskRequestDTO.getStatus());
        // Les champs createdAt et updatedAt seront gérés par JPA ou un service
        return task;
    }

    // Méthode pour convertir une entité Task en TaskRequestDTO (si nécessaire, par exemple pour les réponses)
    public static Projettodolist.to_do_list.dto.TaskRequestDTO toTaskRequestDTO(Task task) {
        Projettodolist.to_do_list.dto.TaskRequestDTO taskRequestDTO = new Projettodolist.to_do_list.dto.TaskRequestDTO();
        taskRequestDTO.setTitle(task.getTitle());
        taskRequestDTO.setDescription(task.getDescription());
        taskRequestDTO.setStatus(task.getStatus());
        return taskRequestDTO;
    }

}
