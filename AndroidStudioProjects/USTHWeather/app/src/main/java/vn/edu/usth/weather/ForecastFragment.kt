
import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
): View {
//        LinearLayout linearLayout = new LinearLayout(getContext());
//        linearLayout.setOrientation(LinearLayout.VERTICAL);
//        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.MATCH_PARENT
//        ));
//        linearLayout.setBackgroundColor(Color.parseColor("#200000FF"));
//        TextView textView = new TextView(getContext());
//        textView.setText(" A day ");
//        textView.setTextColor(Color.MAGENTA);
//        textView.setTextSize(24);
//        LinearLayout.LayoutParams textParams = new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.WRAP_CONTENT,
//                LinearLayout.LayoutParams.WRAP_CONTENT
//        );
//        textParams.setMargins(16, 16, 16, 8);
//        linearLayout.addView(textView, textParams);
//        ImageView imageView = new ImageView(getContext());
//        imageView.setImageResource(R.drawable.cloudy);
//        LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.WRAP_CONTENT,
//                LinearLayout.LayoutParams.WRAP_CONTENT
//        );
//        textParams.setMargins(16, 16, 16, 8);
//        linearLayout.addView(imageView, imageParams);
    return inflater.inflate(R.layout.fragment_forecast, container, false)
    val view: View = inflater.inflate(R.layout.fragment_forecast, container, false)
    return view
}