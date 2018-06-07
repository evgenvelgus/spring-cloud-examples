import org.springframework.cloud.contract.spec.Contract

Contract.make {

    request {
        method 'GET'
        urlPath('/me/accounts') {
            queryParameters {
                parameter 'access_token': 'EAAAAIm3moD0BACYVhLV5F8nUEWJYJLnu5UGAZBehHmUROFHGpWJ89qFrCbwChT59OVt4HBoJZAZCH6ztZBHarkOVmpY2nAzRJGhIvcFZAMWPnfoNZB3r4oB8DnCRjOI0KfMnyuIjgN5uccpENo7U4KsHtuwQQ9ZCIvcI5qsgnhT8LjiJDi5zvxIjeOZC9MZA4wpazBpNVv0XSuwZDZD'
                parameter 'fields': 'category,name'
            }
        }
    }

    response {
        status 200
        body([
                [
                        category: 'Just For Fun',
                        id      : '180640909314336',
                        name: 'Sk.test.page'
                ],
                [
                        category: 'Advertising/Marketing',
                        id      : '1605754709513814',
                        name : 'IFor page'
                ],
                [
                        category: 'Pop-Up Shop',
                        id      : '122035465149140',
                        name : 'Royal School of Kenshoo'
                ]
        ]
        )
        headers {
            header('Content-Type': value(
                    producer(regex('application/json.*')),
                    consumer('application/json')
            ))
        }
    }
}
