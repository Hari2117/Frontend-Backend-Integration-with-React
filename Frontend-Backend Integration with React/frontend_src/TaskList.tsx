import {useEffect,useState} from "react"
import api from "../services/api"

function TaskList(){

const [tasks,setTasks]=useState([])

useEffect(()=>{

api.get("/tasks").then(res=>setTasks(res.data))

},[])

return(

<div>

<h2>Tasks</h2>

<ul>

{tasks.map((t:any)=>(

<li key={t.id}>{t.title}</li>

))}

</ul>

</div>

)

}

export default TaskList
