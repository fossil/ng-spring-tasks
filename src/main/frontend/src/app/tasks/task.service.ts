import {Http} from "@angular/http";
import {Injectable} from "@angular/core";
import {map} from    "rxjs/operators";

@Injectable()
export class TaskService {

  constructor(private http : Http) { }

  getTasks() {
    return this.http.get("/api/tasks").pipe(map(response => response.json()));
  }

}
