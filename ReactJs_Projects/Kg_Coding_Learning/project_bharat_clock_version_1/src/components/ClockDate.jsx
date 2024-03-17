

function ClockDate() {
  var time = new Date()
  return (<div className="row date-box d-flex justify-content-center align-items-center">
    {time.toLocaleDateString()}
  </div>)
}

export default ClockDate;