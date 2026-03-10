import { useState } from "react"

export default function LoginForm(){

const [user,setUser] = useState("")

return(

<div>

<h2>Login</h2>

<input
placeholder="username"
onChange={e=>setUser(e.target.value)}
/>

<button>Login</button>

</div>

)

}