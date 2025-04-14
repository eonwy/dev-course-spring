const API_URL = 'https://dapi.kakao.com/v3/search/book?';
const API_KEY = 'KakaoAK cd071edfdaa8bae521ef800793875782';

const api = async params => {
  const queryString = new URLSearchParams(params).toString();
  const response = await fetch(API_URL + queryString, {
    headers: {Authorization: API_KEY}
  });

  return response.json();
}

export default api;