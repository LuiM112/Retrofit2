package viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;


import com.example.myapplication.ApiKeys;

import models.VolumesResponse;
import repositories.BookRepository;

public class BookSearchViewModel extends AndroidViewModel {
    private BookRepository bookRepository;
    private LiveData<VolumesResponse> volumesResponseLiveData;

    public BookSearchViewModel(@NonNull Application application) {
        super(application);
    }

    public void init() {
        bookRepository = new BookRepository();
        volumesResponseLiveData = bookRepository.getVolumesResponseLiveData();
    }

    public void searchVolumes(String keyword, String author) {
        ApiKeys KEYS = new ApiKeys();
        bookRepository.searchVolumes(keyword, author, KEYS.getKEY() );
    }

    public LiveData<VolumesResponse> getVolumesResponseLiveData() {
        return volumesResponseLiveData;
    }
}