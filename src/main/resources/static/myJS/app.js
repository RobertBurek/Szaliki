var map = L.map('mapid').setView([52.3415, 20.9764], 10);

L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
    attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
}).addTo(map);

L.marker([52.3415, 20.9764]).addTo(map)
    .bindPopup('Maestro <br>Finansów')
    .openPopup();

nPopup();
