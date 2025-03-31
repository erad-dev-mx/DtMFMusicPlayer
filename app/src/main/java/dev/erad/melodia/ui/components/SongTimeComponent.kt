package dev.erad.melodia.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.erad.melodia.R
import dev.erad.melodia.ui.theme.DtMFMusicPlayerTheme

@Composable
fun SongTimeComponent(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(bottom = 32.dp)) {
        Box {
            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(color = MaterialTheme.colorScheme.tertiaryContainer),
            )
            Box(
                modifier = modifier
                    .width(70.dp)
                    .height(10.dp)
                    .background(color = MaterialTheme.colorScheme.primary),
            )
        }
        Spacer(modifier = modifier.height(16.dp))
        Row(modifier = modifier) {
            Text(text = stringResource(R.string.text_current_time), style = MaterialTheme.typography.bodySmall)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = stringResource(R.string.text_time_spacer), style = MaterialTheme.typography.bodySmall)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = stringResource(R.string.text_total_time), style = MaterialTheme.typography.bodySmall)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SongTimeComponentPreview() {
    DtMFMusicPlayerTheme {
        SongTimeComponent()
    }
}