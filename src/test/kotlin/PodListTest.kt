import io.kubernetes.client.openapi.ApiClient
import io.kubernetes.client.openapi.Configuration
import io.kubernetes.client.openapi.apis.CoreV1Api
import io.kubernetes.client.util.Config
import org.junit.jupiter.api.Test


class PodListTest {

    @Test
    fun `pod의 리스트를 가지고 올 수 있다`() {
        val client: ApiClient = Config.defaultClient()
        Configuration.setDefaultApiClient(client)

        val api = CoreV1Api()
        val list = api.listPodForAllNamespaces(null, null, null, null, null, null, null, null, null, null)
        for (item in list.items) {
            println(item.metadata!!.name)
        }
    }
}