import AppName from "./components/AppName.jsx"
import ClockDate from "./components/ClockDate.jsx";
import ClockTime from "./components/ClockTime.jsx"

function App() {
  return (<div className="container-fluid h-100 w-100 d-flex justify-content-center align-items-center flex-column" style={{ "backgroundColor": "#72A98F", "color": "#CBEF43" }}>
    <AppName></AppName>
    <div className="container">
      <ClockDate></ClockDate>
      <ClockTime></ClockTime>
    </div>
  </div>
  );
}
export default App;
