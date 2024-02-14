package presentation.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource

@Composable
fun CoinCard(
    modifier: Modifier = Modifier,
    name: String?,
    id: String?,
    imageUrl: String?,
    onItemClick: (String?) -> Unit
) {
    Card(
        modifier = modifier.padding(4.dp)
            .fillMaxWidth(),
        elevation = 8.dp
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
                .wrapContentHeight().padding(8.dp).clickable {
                    onItemClick?.invoke(id)
                }) {
            KamelImage(
                modifier = Modifier.fillMaxWidth().height(120.dp),
                resource = asyncPainterResource(imageUrl.orEmpty()),
                contentDescription = name
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = name.orEmpty(),
                style = MaterialTheme.typography.subtitle2,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
        }
    }
}
