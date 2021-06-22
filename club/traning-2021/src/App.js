import React from 'react';
import GridComponent from './components/GridComponent'
import FromComponents from './components/FromComponents'

class App extends React.Component{

  render(){
    return(
      <div className='contanier'>
        <div className='row'>
          <div className='col'>
          <GridComponent/>
          </div>
          <div className='col'>
          <FromComponents/>
          </div>
        </div>
      </div>
    )
  }
}

export default App;
