import React from "react";

export default class FromComponent extends React.Component{

    constructor (props){
        super(props)
        this.state={
            name:'',
            description:'',
            price:0.0,
            quantity:0
        }
    }
    handleChange = e =>{
        this.setState({
            [e.target.name]:e.target.value
        })
    }

    handleSubmit = e =>{
        e.proventDefault()
        console.log(this.state)
    }

    render(){
        return(
            <>
                <form onSubmit={this.handleSubmit}>
                    <label className='from-label'>Name </label>
                    <input type="text"
                    name="name"
                    value={this.state.name}
                    onChange={this.handleChange}
                    className="from-control"/>

                    <label className='from-label'>Description </label>
                    <input type="text"
                    name="description"
                    value={this.state.description}
                    onChange={this.handleChange}
                    className="from-control"/>  

                    <label className='from-label'>Price </label>
                    <input type="number"
                    name="price"
                    value={this.state.price}
                    onChange={this.handleChange}
                    className="from-control"/> 

                    <label className='from-label'>quantity </label>
                    <input type="number"
                    name="quantity"
                    value={this.state.quantity}
                    onChange={this.handleChange}
                    className="from-control"/>   

                    <div className='container py-3'>
                    <button className='btn btn-primary'> save </button>
                    </div>    
                </form>
            </>
        )
    }
}