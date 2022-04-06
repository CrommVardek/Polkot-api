package polkot.api

import polkot.model.Block
import polkot.ws.PolkadotWebSocket
import polkot.ws.PolkadotWebsocketListener


class PolkotApi : AbstractPolkotApi, IPolkotApi{

    private val polkadotWebSocket: PolkadotWebSocket = TODO()
    private val polkadotWSListener: PolkadotWebsocketListener

    constructor(url: String) {
        polkadotWSListener = PolkadotWebsocketListener()
        polkadotWebSocket = PolkadotWebSocket(url, polkadotWSListener)
    }

    override fun rawRequest(rpcMethod: String): String {
        //TODO
        //val result = polkadotWebSocket.sendText(rpcMethod)
        return ""
    }


}