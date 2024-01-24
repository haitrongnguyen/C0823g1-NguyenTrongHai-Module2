// import React,{Component} from "react";
// import Hello from "./components/Hello";
// import Home from "./components/Home";
import { Component } from 'react';
import './App.css'
import Alert from "./components/Alert";
// class App extends Component {
  // constructor(props){
  //   super(props);
  //   this.state = {
  //     color: 'black'
  //   };
  // }
  // componentDidMount(){
  //   setTimeout(()=>{
  //     this.setState({color:'pink'});
  //   },3000);
  // }
  // render(){
  //   return(
  //     <div>
  //       <div style={{
  //         backgroundColor: this.state.color,
  //         paddingTop: 20,
  //         width: 400,
  //         height: 80,
  //         margin: 'auto'
  //       }}>

  //       </div>
  //     </div>
  //   )
  // }
  // constructor(props){
  //   super(props);
  //   this.state = {
  //     display : true
  //   }
  // }
  // delete = () =>{
  //     this.setState({display: false})
  // }
  // displayA = () => {
  //   this.setState({display: true})
  // }
  // render(){
  //   let comp;
  //   if(this.state.display){
  //     comp = <Hello />
  //   }
  //   return(
  //     <div style={{ textAlign: 'center' }}>
  //       {comp}
  //       <button onClick={this.delete}>
  //         Delete the component
  //       </button>
  //       <button onClick={this.displayA}>
  //         Display the component
  //       </button>
  //     </div>
  //   )
      
  //   }
  // constructor(props){
  //   super(props);
  //   this.state = {
  //     isLoggedIn : false
  //   }
  // }
  // handelLogin = () => {
  //   this.setState({isLoggedIn : true})
  // }
  // handelLogout = () => {
  //   this.setState({isLoggedIn : false})
  // }
  // render(){
  //   const {isLoggedIn} = this.state
  //   if(isLoggedIn) return (<Home onLogout = {this.handelLogout}/>)
  //   return(
  //     <div style={{textAlign: 'center'}}>
  //       <div>
  //           <h1>Please Log in</h1>
  //           <button onClick={this.handelLogin}>Log in</button>
  //       </div>
  //     </div>
  //   )
  // }
//   function App(){
  
//     return (
//       <div className='alert alert-warning'>
//         <Alert text = 'Canh bao! Tai nguyen ban truy cap khong ton tai' />
//       </div>
//     )
  
// }
class App extends Component{
  constructor(props) {
    super(props);
    this.state = {
      inputValue1: 0,
      inputValue2: 0,
      result : 0
    };
  }

  handleChange(event) {
    this.setState({ inputValue1: parseInt(event.target.value) });
  }
  handleChange1(event) {
    this.setState({ inputValue2: parseInt(event.target.value) });
  }

  handleSubmit() {
    this.setState({result : this.state.inputValue1 + this.state.inputValue2})
    console.log('Kết quả:', this.state.inputValue1 + this.state.inputValue2);
  }

  render() {
    return (
      <div>
        <form>
          <input type="number" value={this.state.inputValue1} onChange={this.handleChange.bind(this)} />
          <input type="number" value={this.state.inputValue2} onChange={this.handleChange1.bind(this)} />
          <button type="submit" onClick={handleSubmit.bind(this)}>+</button>
          <button type="submit">-</button>
          <button type="submit">*</button>
          <button type="submit">/</button>
        </form>
        <p> Kết quả: {result}</p>
      </div>
    );
  }
}
export default App;
