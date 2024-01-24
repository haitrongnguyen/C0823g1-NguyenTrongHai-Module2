import React,{Component} from "react";
class Home extends Component{
    render(){
        return(
            <div>
                <h1>Wellcome</h1>
                <button onClick={this.props.onLogout}>Logout</button>
            </div>
        )
    }
}
export default Home;