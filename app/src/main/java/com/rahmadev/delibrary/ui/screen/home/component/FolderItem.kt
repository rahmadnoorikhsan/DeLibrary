package com.rahmadev.delibrary.ui.screen.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rahmadev.delibrary.R
import com.rahmadev.delibrary.ui.theme.DeLibraryTheme
import java.util.Locale

@Composable
fun FolderItem(
    faculty: String,
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(
            imageVector = ImageVector.vectorResource(R.drawable.ic_folder),
            contentDescription = "Folder Icon"
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = faculty.uppercase(Locale.getDefault()),
            style = MaterialTheme.typography.titleMedium.copy(
                fontWeight = FontWeight.Bold,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun FolderItemPreview() {
    DeLibraryTheme {
        FolderItem(faculty = "FITE")
    }
}