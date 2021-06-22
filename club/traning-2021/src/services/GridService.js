export const findAll = async () => {
    let resultJson=[]
    try{
        const res = await fetch ('http://3.142.146.106:5000/products/findAllProducts')
        resultJson = await res.json()
    }catch(e){
        console.error(e)
    }
    return resultJson
}

export const insert=()=>{

    try{
        const body = {...data,price:parseFloat(data.price.toString()),}
        const res = await fetch ('http://3.142.146.106:5000/products/findAllProducts',{
        method:'post',
        body: JSON.stringify(data)
    })
    resultJson = await res.json()
    }catch(e){
        console.error(e)
    }

}