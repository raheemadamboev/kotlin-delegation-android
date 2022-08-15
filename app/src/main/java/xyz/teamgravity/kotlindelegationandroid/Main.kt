package xyz.teamgravity.kotlindelegationandroid

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import xyz.teamgravity.kotlindelegationandroid.ui.theme.KotlinDelegationAndroidTheme

class Main : ComponentActivity(), AnalyticsLogger by AnalyticsLoggerImp(), DeepLinkHandler by DeepLinkHandlerImpl() {

    private val shit: String by lazy {
        println("raheem: initializing shit")
        "Shamsiddin"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerLifecycleOwner(this)
        println("raheem: shit: $shit")
        println("raheem: shit: $shit")
        setContent {
            KotlinDelegationAndroidTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        handleDeepLink(this, intent)
    }
}