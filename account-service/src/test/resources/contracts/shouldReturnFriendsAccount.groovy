import org.springframework.cloud.contract.spec.Contract

Contract.make {

    request {
        method 'GET'
        url value(consumer('https://graph.facebook.com/act_359773042'), producer('https://graph.facebook.com/act_359773042'))
    }

    response {
        status 200
        body([
                account_id: '359773042',
                id: 'act_359773042'
        ])
        headers {
            header('Content-Type': value(
                    producer(regex('application/json.*')),
                    consumer('application/json')
            ))
        }
    }
}
