package com.mozn.applicationdpei.API
import androidx.lifecycle.*
import kotlinx.coroutines.launch

class PostViewModel(private val repository: PostRepository): ViewModel() {

    private val _posts = MutableLiveData<List<Post>>()
    val posts: LiveData<List<Post>> get() = _posts

    fun fetchPosts(){
        viewModelScope.launch {
            try {
                val response = repository.getPost()
                _posts.postValue(response)
            }
            catch (e: Exception){
                e.printStackTrace()
            }
        }
    }



}