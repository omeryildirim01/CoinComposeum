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
import domain.model.news.NewsModel
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource

@Composable
fun NewsCard(
    modifier: Modifier = Modifier,
    news: NewsModel,
    onItemClick: (String) -> Unit
) {
    Card(
        modifier = modifier.padding(4.dp)
            .fillMaxWidth(),
        elevation = 8.dp
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
                .wrapContentHeight().padding(8.dp).clickable {

                }) {
            KamelImage(
                modifier = Modifier.fillMaxWidth().height(120.dp),
                resource = asyncPainterResource(news.imageUrl.orEmpty()),
                contentDescription = news.title
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = news.title.orEmpty(),
                style = MaterialTheme.typography.subtitle2,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2
            )
        }
    }
}
