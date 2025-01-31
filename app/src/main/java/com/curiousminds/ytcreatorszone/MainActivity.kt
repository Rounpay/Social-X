package com.curiousminds.ytcreatorszone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

import com.curiousminds.ytcreatorszone.navigation.MainNavGraph
import com.curiousminds.ytcreatorszone.ui.theme.AppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                MainNavGraph()
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
private fun PreviewMainActivity() {
    PreviewAppTheme {
        PreviewMainNavGraph()
    }
}

@Composable
private fun PreviewAppTheme(content: @Composable () -> Unit) {
    // Simplified theme for preview
    androidx.compose.material3.MaterialTheme(content = content)
}

@Composable
private fun PreviewMainNavGraph() {
    // Mock or simplified version of MainNavGraph
}

