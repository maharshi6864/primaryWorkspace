import './css/style.css'
import AppName from './components/AppName';


function App() {
  return (

    <center className='todo-list-area'>
      <AppName></AppName>
      <div class="container text-center">
        <div class="row g-2 list-head-border">
          <div class="col-6 border border-dark border-bottom-0">
            <h3>Task</h3>
          </div>
          <div class="col-4 border border-dark border-bottom-0">
            <h3>Date</h3>
          </div>
          <div class="col-2 border border-dark border-bottom-0">
            <h3>Action</h3>
          </div>
        </div>
        <div class="row g-2 list-head-border dis">
          <div class="col-6  border border-dark">
            <div class="form-floating d-flex align-items-center justify-content-center p-2">
              <input type="text" class="form-input" id="task-name" placeholder="Enter you task" />
            </div>
          </div>
          <div class="col-4 border border-dark d-flex align-items-center justify-content-center p-2">
            <input type="date" class="form-input" id="floatingInput" placeholder="name@example.com" />
          </div>
          <div class="col-2 border border-dark d-flex align-items-center justify-content-center p-2">
            <button type="button" class="btn btn-success">Add Task</button>
          </div>
        </div>
        <div class="row g-2 list-head-border dis text-align-center">
          <div class="col-6  border border-dark d-flex align-items-center justify-content-center p-2 fs-5">
            <div class="form-floating ">
              Complete task 1
            </div>
          </div>
          <div class="col-4 border border-dark d-flex align-items-center justify-content-center p-2 fs-5">
            12/2/2024
          </div>
          <div class="col-2 border border-dark d-flex align-items-center justify-content-center p-2 fs-5">
            <button type="button" class="btn btn-danger">Done</button>
          </div>
        </div>
      </div>
    </center>
  );
}

export default App;
