import org.springframework.cloud.contract.spec.Contract

Contract.make {

    request {
        method 'GET'
        url '/account/359773042'
    }

    response {
        status 200
        body([
                id: 'act_359773042',
                accountId: '0',
                accountStatus: '0'
        ])
        headers {
            header('Content-Type': value(
                    producer(regex('application/json.*')),
                    consumer('application/json')
            ))
        }
    }
}
