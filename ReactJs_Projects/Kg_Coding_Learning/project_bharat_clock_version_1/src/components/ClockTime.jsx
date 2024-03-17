function ClockTime() {
  var time = new Date()
  return <div div className="row p-0 time-box d-flex justify-content-center align-items-center" >
    {time.toLocaleTimeString()}
  </div >
}

export default ClockTime;