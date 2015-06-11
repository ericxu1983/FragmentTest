package comericxu1983.github.fragmenttest;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public abstract class BaseFragment extends Fragment {

    protected abstract String TAG();

    public BaseFragment() {
    }

    @Override
    public void onAttach(Activity activity) {
        Log.d(TAG(), new Throwable().getStackTrace()[0].getMethodName());

        super.onAttach(activity);

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG(), new Throwable().getStackTrace()[0].getMethodName());

        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG(), new Throwable().getStackTrace()[0].getMethodName());

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d(TAG(), new Throwable().getStackTrace()[0].getMethodName());

        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(TAG(), new Throwable().getStackTrace()[0].getMethodName());

        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(TAG(), new Throwable().getStackTrace()[0].getMethodName());

        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(TAG(), new Throwable().getStackTrace()[0].getMethodName());

        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG(), new Throwable().getStackTrace()[0].getMethodName());

        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d(TAG(), new Throwable().getStackTrace()[0].getMethodName());

        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG(), new Throwable().getStackTrace()[0].getMethodName());

        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d(TAG(), new Throwable().getStackTrace()[0].getMethodName());

        super.onDetach();
    }
}
