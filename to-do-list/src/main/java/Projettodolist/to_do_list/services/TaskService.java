package Projettodolist.to_do_list.services;

import Projettodolist.to_do_list.dto.TaskRequestDTO;
import Projettodolist.to_do_list.mapper.TaskMapper;
import Projettodolist.to_do_list.model.Task;
import Projettodolist.to_do_list.repository.TaskRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();
    private final TaskRepository taskRepository;


    public Task createTask(TaskRequestDTO task) {
        return taskRepository.save(TaskMapper.toTask(task));
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public List<Task> getTasksByStatus(Task.TaskStatus status) {
        List<Task> filteredTasks = taskRepository.findAll();
        for (Task task : tasks) {
            if (task.getStatus() == status) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }

    public Task updateTask(Long id, TaskRequestDTO updatedTask) {
        Task taskToUpdate = taskRepository.findById(id).get();
        taskToUpdate.setDescription(updatedTask.getDescription());
        taskToUpdate.setTitle(updatedTask.getTitle());
        taskToUpdate.setStatus(updatedTask.getStatus());
        return taskRepository.save(taskToUpdate);
    }

    public void deleteTask(Long id) {

        taskRepository.deleteById(id);
    }
}
