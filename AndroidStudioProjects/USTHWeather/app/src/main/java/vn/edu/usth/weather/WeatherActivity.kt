import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_refresh) {
            simulateNetworkRequest();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void simulateNetworkRequest() {
        // Show a Toast message before simulating the network request
        Toast.makeText(this, "Refreshing...", Toast.LENGTH_SHORT).show();

        // Create a Handler to simulate a delay (like a network request)
        Handler handler = new Handler(Looper.getMainLooper());
        new Thread(() -> {
        try {
            // Simulate a delay (e.g., 2 seconds)
            Thread.sleep(2000);

            // Post the result back to the main thread
            handler.post(() -> {
                // Show a Toast message indicating that the "network request" is complete
                Toast.makeText(MainActivity.this, "Data refreshed!", Toast.LENGTH_SHORT).show();
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }).start();
    }