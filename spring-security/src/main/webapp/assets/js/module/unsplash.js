import dayjs from 'https://cdn.jsdelivr.net/npm/dayjs@1.11.13/+esm';

const API_URL = 'https://api.unsplash.com/photos/random?';
const API_KEY = 'MaPRO8wHNx761-MSN5N8zjk3YULpZJc35-fZYp3U1AU';
const params = {
  client_id: API_KEY,
  orientation: 'landscape',
  query: 'landscape'
}

const queryString = new URLSearchParams(params);

const api = async () => {
  const response = await fetch(API_URL + queryString, {
    header: {
      'Accept-Version' : 'v1'
    }
  });
  return response.json();
}

async function createToken() {
  const {
    urls : {full:bg},
    location: {name:location},
  } = await api();

  const newToken = {
    bg: bg,
    location: location,
    expire: dayjs().add(1, 'day')
  };

  localStorage.setItem('unsplash-token', JSON.stringify(newToken));
  return newToken;
}

const getToken = async () => {
  const storedToken = JSON.parse(localStorage.getItem('unsplash-token'));

  if (storedToken && dayjs().isBefore(storedToken.expire)) {
    return storedToken;
  }

  return createToken();
}

export { api };
export default getToken;