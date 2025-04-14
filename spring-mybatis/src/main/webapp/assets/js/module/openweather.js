const API_KEY = '0cf78b5ae09f3b8bfe97722a9212096f';
const API_URL = 'https://api.openweathermap.org/data/2.5/weather?';

const api = async coords => {
  const params = {
    lat:coords.latitude,
    lon:coords.longitude,
    appid:API_KEY,
    units:'metric'
  };

  const url = API_URL + new URLSearchParams(params).toString();
  const response = await fetch(url);
  return response.json();
}

export default api;