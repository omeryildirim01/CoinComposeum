package presentation.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
        shape = MaterialTheme.shapes.small,
        elevation = 8.dp
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(8.dp).clickable {

                }) {

            Spacer(modifier = Modifier.height(8.dp))

            Row {
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = news.sourceInfo?.name.orEmpty(),
                    style = MaterialTheme.typography.caption,
                    color = Color.Magenta
                )
                Spacer(modifier = Modifier.width(24.dp))
            }

            KamelImage(
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Fit,
                resource = asyncPainterResource(news.imageUrl.orEmpty()),
                contentDescription = news.title
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = news.title.orEmpty(),
                style = MaterialTheme.typography.subtitle1,
            )

            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = news.body.orEmpty(),
                style = MaterialTheme.typography.body2,
                overflow = TextOverflow.Ellipsis,
                maxLines = 6
            )
        }
    }
}
