import React from 'react'
import {findAll} from '../services/GridService'
class GridComponent extends React.Component{


    constructor(props){
        super(props)
        this.state = {
            data:[],
        }
    }

    async componentDidMount(){
        const {data} = await findAll()
        this.setState({data})
    }

    render(){
        return (
        <div>
            <table className="table">
                <thead>
                    <tr>
                    <th>#</th>
                    <th>name</th>
                    <th>description</th>
                    <th>price</th>
                    <th>quantity</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        this.state.data.map(d =>
                            <tr key={d.id}>
                            <th>{d.id}</th>
                            <th>{d.name}</th>
                            <th>{d.description}</th>
                            <th>{d.price}</th>
                            <th>{d.quantity}</th>
                            </tr>
                        )
                    }
                </tbody>
            </table>
        </div>
        )
    }
}
export default GridComponent