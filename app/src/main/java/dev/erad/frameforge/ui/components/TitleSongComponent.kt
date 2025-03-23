package dev.erad.frameforge.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.erad.frameforge.ui.theme.DtMFMusicPlayerTheme

@Composable
fun TitleSongComponent(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 32.dp, bottom = 32.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = modifier.weight(4f)) {
            Text(
                "DtMF",
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.secondary,
                fontWeight = FontWeight.Bold
            )
            Text(
                "Bad Bunny",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.secondary,
                fontWeight = FontWeight.Bold
            )
        }
        Icon(
            imageVector = Icons.Default.FavoriteBorder,
            contentDescription = "Favorite Icon",
            modifier = modifier
                .weight(1f)
                .clickable {},
            tint = MaterialTheme.colorScheme.secondary
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TitleSongComponentPreview() {
    DtMFMusicPlayerTheme {
        TitleSongComponent()
    }
}