package util

sealed class RequestResult<T> {
    class Loading<T>() : RequestResult<T>()
    class Success<T>(val data: T?) : RequestResult<T>()
    class Error<T>(val message: String) : RequestResult<T>()
}