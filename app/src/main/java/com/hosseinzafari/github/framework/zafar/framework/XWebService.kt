package com.hosseinzafari.github.framework.zafar.framework

/*
    @created in 01/08/2021 - 6:52 PM
    @project ZafarFramework
    @author Hossein Zafari
    @email  hosseinzafari2000@gmail.com
*/

/**
* XWebService class is a RestApi Service For Connecting To Server
* And Send , Receive Data With [POST , GET , DELETE , PUT ] Methods
* @param url You Must Set Your Endpoint Url (main url , like https://example/api/v1/)
* @param resourceName Is Your Last Part of Url (Calls , like EndpointUrl/user/:id)
* @param props For Easy Put Your Settings In XWebService Like Builder Design Pattern
* @author Hossein Zafari
* @sample <strong>Demo</strong>
* <code>
*    val webservice = XWebService(
*        url = "https://google.com/v1" ,
*        resourceName = "/user/:id"
*    ) {
*        enableCache = false
*        method = "get"
*    }
*</code>
*/

class XWebService(
    var url: String,
    var resourceName: String = "",
    props: XWebService.() -> Unit = {},
) {
    var method: String = "post"
    var retryCount = 3
    var timeout = 20_000L
    var enableCache: Boolean = true
    var retryInterval = 1_000L

    init {
        props(this)
    }

    operator fun String.unaryPlus() {

    }

    fun connect(): Int {

        return 2
    }


}