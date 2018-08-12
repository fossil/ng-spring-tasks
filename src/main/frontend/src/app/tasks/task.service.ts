import {Http} from "@angular/http";
import {Injectable} from "@angular/core";
import {map} from "rxjs/operators";
import {Task} from './task.model';

@Injectable()
export class TaskService {

  constructor(private http : Http) { }

  getTasks() {
    return this.http.get("/api/tasks").pipe(map(response => response.json()));
  }

  saveTask(task : Task, checked : boolean) {
    task.completed = checked;
    return this.http.post('/api/tasks/save', task).pipe(map(response => response.json()));
  }
}
